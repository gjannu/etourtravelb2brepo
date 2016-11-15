/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.etourtravelb2b.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.etourtravelb2b.fulfilmentprocess.constants.Etourtravelb2bFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class Etourtravelb2bFulfilmentProcessManager extends GeneratedEtourtravelb2bFulfilmentProcessManager
{
	public static final Etourtravelb2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Etourtravelb2bFulfilmentProcessManager) em.getExtension(Etourtravelb2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
