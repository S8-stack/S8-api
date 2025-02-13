package com.s8.api.flow;

import com.s8.api.bytes.Bool64;
import com.s8.api.flow.delivery.S8WebResourceGenerator;
import com.s8.api.flow.mail.SendMailS8Request;
import com.s8.api.flow.repository.requests.CloneBranchS8Request;
import com.s8.api.flow.repository.requests.CommitBranchS8Request;
import com.s8.api.flow.repository.requests.CreateRepositoryS8Request;
import com.s8.api.flow.repository.requests.ForkBranchS8Request;
import com.s8.api.flow.repository.requests.ForkRepositoryS8Request;
import com.s8.api.flow.repository.requests.GetBranchMetadataS8Request;
import com.s8.api.flow.repository.requests.GetRepositoryMetadataS8Request;
import com.s8.api.flow.space.requests.AccessSpaceS8Request;
import com.s8.api.flow.space.requests.CreateSpaceS8Request;
import com.s8.api.flow.space.requests.ExposeSpaceS8Request;
import com.s8.api.flow.table.objects.RowS8Object;
import com.s8.api.flow.table.requests.CreateTableS8Request;
import com.s8.api.flow.table.requests.GetRowS8Request;
import com.s8.api.flow.table.requests.PutRowS8Request;
import com.s8.api.flow.table.requests.SelectRowsS8Request;


/**
 * The main orchestratino flow of the S8 Stack.
 * 
 * @author Pierre Convert
 * Copyright (c) 2025, Pierre Convert. All rights reserved.
 *
 */
public interface S8AsyncFlow {
	
	
	/**
	 * CREATE_SPACE_IF_NOT_PRESENT
	 */
	public final static long CREATE_SPACE_IF_NOT_PRESENT = Bool64.BIT02;
	
	
	/**
	 * SAVE_IMMEDIATELY_AFTER
	 */
	public final static long SAVE_IMMEDIATELY_AFTER = Bool64.BIT03;
	
	
	/**
	 * SHOULD_NOT_OVERRIDE
	 */
	public final static long SHOULD_NOT_OVERRIDE = Bool64.BIT04;
	
	
	/**
	 * TAG for HEAD version of a repository stats
	 */
	public final static long HEAD_VERSION = -0x62L;


	
	/**
	 * Return the flow onwer.
	 * 
	 * @return the user
	 */
	public abstract S8User getMe();
	

	/**
	 * Define a user a flow owner.
	 * 
	 * @param user the user.
	 */
	public abstract void setMe(S8User user);

	
	


	
	/**
	 * Get my space id as a user.
	 * @return the user main space id.
	 */
	public default String getMySpaceId() {
		S8User me = getMe();
		if(me != null) {
			return me.getPersonalSpaceId();	
		}
		else {
			return null;
		}
	}


	/**
	 * Run a block of code.
	 * 
	 * @param force indicator of the amount of resource to be mobilized
	 * @param runnable the code block to be run
	 */
	public abstract void runBlock(int force, S8CodeBlock runnable);
	
	

	/**
	 * Send an email.
	 * 
	 * @param request The request Object
	 */
	public abstract void sendEMail(SendMailS8Request request);


	
	
	/**
	 * Create a table.
	 * 
	 * @param request The request Object
	 */
	public abstract void createTable(CreateTableS8Request request);
	
	
	
	/**
	 * Get a row from a table.
	 * 
	 * @param request The request object
	 */
	public abstract void getRow(GetRowS8Request request);
	

	
	/**
	 * Put a row in a table.
	 * 
	 * @param request the request object
	 */
	public abstract void putRow(PutRowS8Request request);
	
	
	/**
	 * Select many rows in a table.
	 * @param request the request object
	 * @param <T> Row type
	 */
	public abstract <T extends RowS8Object> void selectRows(SelectRowsS8Request<T> request);

	
	
	/**
	 * Create a space.
	 * @param request the request object
	 */
	public abstract void createSpace(CreateSpaceS8Request request);
	
	/**
	 * Expose a space.
	 * @param request the request object
	 */
	public abstract void exposeSpace(ExposeSpaceS8Request request);


	/**
	 * Access a space.
	 * @param request the request object
	 */
	public abstract void accessSpace(AccessSpaceS8Request request);
	


	/**
	 * Create a new repository.
	 * Note that:
	 * - initiator will become owner of the repository
	 * - initiator will become owner of the main branch
	 * @param request the request object
	 */
	public abstract void createRepository(CreateRepositoryS8Request request);
	
	
	/**
	 * Get a repository metadata
	 * @param request the request object
	 */
	public abstract void getRepository(GetRepositoryMetadataS8Request request);
	
	
	/**
	 * Get branch
	 * @param request the request object
	 */
	public abstract void getBranch(GetBranchMetadataS8Request request);

	
	/**
	 * Fork an entire repository
	 * @param request the request object
	 */
	public abstract void forkRepository(ForkRepositoryS8Request request);	
	
	
	/**
	 * Fork the branch of a repository
	 * @param request the request object
	 */
	public abstract void forkBranch(ForkBranchS8Request request);
	
	
	
	/**
	 * Commit a branch to a repository
	 * @param request the request object
	 */
	public abstract void commitBranch(CommitBranchS8Request request);

	
	/**
	 * Clone the branch of a repository
	 * 
	 * @param request the request object
	 */
	public abstract void cloneBranch(CloneBranchS8Request request);

	


	/**
	 * Send and play 
	 */
	public void send();



	/**
	 * 
	 */
	public void play();
	
	
	

	/**
	 * Deliver a generated resource
	 * 
	 * @param load
	 * @param generator
	 */
	public void deliver(int load, S8WebResourceGenerator generator);





}
