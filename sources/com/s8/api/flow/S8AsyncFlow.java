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
 * 
 * @author pierreconvert
 * Copyright (c) 2022, Pierre Convert. All rights reserved.
 *
 */
public interface S8AsyncFlow {
	
	
	public final static long CREATE_SPACE_IF_NOT_PRESENT = Bool64.BIT02;
	
	public final static long SAVE_IMMEDIATELY_AFTER = Bool64.BIT03;
	
	public final static long SHOULD_NOT_OVERRIDE = Bool64.BIT04;
	
	public final static long HEAD_VERSION = -0x62L;


	
	/**
	 * 
	 * @return
	 */
	public abstract S8User getMe();
	

	/**
	 * 
	 * @param user
	 */
	public abstract void setMe(S8User user);

	
	


	/**
	 * 
	 * @return
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
	 * 
	 * @param profile
	 * @param runnable
	 */
	public abstract void runBlock(int force, S8CodeBlock runnable);
	
	

	/**
	 * 
	 * @param profile
	 * @param runnable
	 */
	public abstract void sendEMail(SendMailS8Request request);


	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public abstract void createTable(CreateTableS8Request request);
	
	
	/**
	 * 
	 * @param username
	 * @param user
	 * @param onException
	 * @return 
	 */
	public abstract void getRow(GetRowS8Request request);
	

	/**
	 * 
	 * @param id
	 * @param user
	 * @param onException
	 * @return 
	 */
	public abstract void putRow(PutRowS8Request request);
	
	
	/**
	 * 
	 * @param user
	 * @param onException
	 * @return 
	 */
	public abstract <T extends RowS8Object> void selectRows(SelectRowsS8Request<T> request);

	
	
	/**
	 * 
	 * @param spaceId
	 * @param onAccessed
	 * @param onException
	 * @return 
	 */
	public abstract void createSpace(CreateSpaceS8Request request);
	
	/**
	 * 
	 * @param exposure
	 * @param onRebased
	 * @param onException
	 * @return 
	 */
	public abstract void exposeSpace(ExposeSpaceS8Request request);


	/**
	 * 
	 * @param spaceId
	 * @param onAccessed
	 * @param onException
	 * @return 
	 */
	public abstract void accessSpace(AccessSpaceS8Request request);
	


	/**
	 * Note that:
	 * - initiator will become owner of the repository
	 * - initiator will become owner of the main branch
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract void createRepository(CreateRepositoryS8Request request);
	
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public abstract void getRepository(GetRepositoryMetadataS8Request request);
	
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public abstract void getBranch(GetBranchMetadataS8Request request);

	
	/**
	 * 
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract void forkRepository(ForkRepositoryS8Request request);	
	
	
	/**
	 * 
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract void forkBranch(ForkBranchS8Request request);
	
	
	/**
	 * 
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract void commitBranch(CommitBranchS8Request request);

	
	/**
	 * 
	 * @param pre
	 * @param post
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
