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
package com.etourtravelb2b.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.etourtravelb2b.core.constants.Etourtravelb2bCoreConstants;
import com.etourtravelb2b.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
@SuppressWarnings("PMD")
public class Etourtravelb2bCoreManager extends GeneratedEtourtravelb2bCoreManager
{
	public static final Etourtravelb2bCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Etourtravelb2bCoreManager) em.getExtension(Etourtravelb2bCoreConstants.EXTENSIONNAME);
	}
}
