package com.s8.api.flow;

import com.s8.api.bytes.Bool64;
import com.s8.api.flow.delivery.S8WebResourceGenerator;
import com.s8.api.flow.mail.SendMailS8Request;
import com.s8.api.flow.record.objects.RecordS8Object;
import com.s8.api.flow.record.requests.GetRecordS8Request;
import com.s8.api.flow.record.requests.PutRecordS8Request;
import com.s8.api.flow.record.requests.SelectRecordsS8Request;
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
	public abstract S8AsyncFlow runBlock(int force, S8CodeBlock runnable);
	
	

	/**
	 * 
	 * @param profile
	 * @param runnable
	 */
	public abstract S8AsyncFlow sendEMail(SendMailS8Request request);



	/**
	 * 
	 * @param username
	 * @param user
	 * @param onException
	 * @return 
	 */
	public abstract S8AsyncFlow then(GetRecordS8Request request);
	

	/**
	 * 
	 * @param id
	 * @param user
	 * @param onException
	 * @return 
	 */
	public abstract S8AsyncFlow then(PutRecordS8Request request);
	
	
	/**
	 * 
	 * @param user
	 * @param onException
	 * @return 
	 */
	public abstract <T extends RecordS8Object> S8AsyncFlow then(SelectRecordsS8Request<T> request);

	
	
	/**
	 * 
	 * @param spaceId
	 * @param onAccessed
	 * @param onException
	 * @return 
	 */
	public abstract S8AsyncFlow then(CreateSpaceS8Request request);
	
	/**
	 * 
	 * @param exposure
	 * @param onRebased
	 * @param onException
	 * @return 
	 */
	public abstract S8AsyncFlow then(ExposeSpaceS8Request request);


	/**
	 * 
	 * @param spaceId
	 * @param onAccessed
	 * @param onException
	 * @return 
	 */
	public abstract S8AsyncFlow then(AccessSpaceS8Request request);
	


	/**
	 * Note that:
	 * - initiator will become owner of the repository
	 * - initiator will become owner of the main branch
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract S8AsyncFlow then(CreateRepositoryS8Request request);
	
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public abstract S8AsyncFlow then(GetRepositoryMetadataS8Request request);
	
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public abstract S8AsyncFlow then(GetBranchMetadataS8Request request);

	
	/**
	 * 
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract S8AsyncFlow then(ForkRepositoryS8Request request);	
	
	
	/**
	 * 
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract S8AsyncFlow then(ForkBranchS8Request request);
	
	
	/**
	 * 
	 * @param pre
	 * @param post
	 * @return 
	 */
	public abstract S8AsyncFlow then(CommitBranchS8Request request);

	
	/**
	 * 
	 * @param pre
	 * @param post
	 */
	public abstract S8AsyncFlow then(CloneBranchS8Request request);

	


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
