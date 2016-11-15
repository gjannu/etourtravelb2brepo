/**
 *
 */
package com.etourtravelb2b.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.commercefacades.voucher.VoucherFacade;
import de.hybris.platform.commercefacades.voucher.data.VoucherData;
import de.hybris.platform.commercefacades.voucher.exceptions.VoucherOperationException;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.promotions.PromotionsService;
import de.hybris.platform.promotions.model.PromotionGroupModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.voucher.VoucherModelService;
import de.hybris.platform.voucher.VoucherService;
import de.hybris.platform.voucher.model.VoucherModel;

import java.util.Collection;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author GJANNU
 *
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/checkout/voucher")
public class VoucherController extends AbstractPageController
{

	private static final String REDIRECT_URL_ADD_PAYMENT_METHOD = REDIRECT_PREFIX + "/checkout/multi/payment-method/add";
	//private static final String REDIRECT_URL_ADD_PAYMENT_METHOD = REDIRECT_PREFIX + "	/checkout/multi/delivery-address/add";


	VoucherModel voucherModel;

	VoucherModel restrictedVoucherModel;

	VoucherData voucherData;
	private PromotionGroupModel promotionGroup;

	CartModel cartModel;
	Collection<String> appliedVoucherCodes;
	//private DefaultVoucherFacade voucherFacade;
	@Resource
	private PromotionsService promotionsService;
	@Resource
	private ModelService modelService;
	@Resource
	private VoucherService voucherService;
	@Resource
	private VoucherModelService voucherModelService;
	@Resource
	private CartService cartService;
	@Resource
	private Converter<VoucherModel, VoucherData> voucherConverter;
	@Resource
	private VoucherFacade voucherFacade;


	@RequestMapping(value = "/redeem", method = RequestMethod.GET)
	public String redeemVoucher(@RequestParam("voucherNumber") final String voucherCode, final Model model,
			final HttpServletRequest request)
	{
		try
		{
			System.out.println("Called in Voucher");
			if (null == voucherCode || voucherCode.isEmpty())
			{
				System.out.println("Voucher Code can not be Empty");
				return REDIRECT_URL_ADD_PAYMENT_METHOD + "?Message=Voucher Code can't be Empty..";
			}
			System.out.println("Called in Voucher");
			voucherFacade.applyVoucher(voucherCode);
			modelService.save(cartService.getSessionCart());
			/*
			 * promotionGroup = promotionsService.getPromotionGroup("etourtravelPromoGrp"); final List<PromotionGroupModel>
			 * groups = new ArrayList<PromotionGroupModel>(); groups.add(promotionGroup); final
			 * Collection<PromotionGroupModel> collection = groups; promotionsService.updatePromotions(collection,
			 * cartService.getSessionCart(), false, AutoApplyMode.APPLY_ALL, AutoApplyMode.APPLY_ALL, new
			 * java.util.Date());
			 */
			modelService.refresh(cartService.getSessionCart());
		}
		catch (final VoucherOperationException e)
		{
			// YTODO Auto-generated catch block
			System.out.println("Voucher Exception");
			e.printStackTrace();
			request.setAttribute("errorStatus", "true");
			request.setAttribute("error", "Not A Valid Voucher");
			return REDIRECT_URL_ADD_PAYMENT_METHOD + "?Message=" + e.getMessage();

		}
		return REDIRECT_URL_ADD_PAYMENT_METHOD + "?Message=Voucher has been Applied Successfully..";
	}


	/*
	 * @RequestMapping(value = "/release", method = RequestMethod.GET) public String releaseVoucher() { try {
	 * System.out.println("Called in Release Voucher"); final List<VoucherData> voucher =
	 * voucherFacade.getVouchersForCart(); for (final VoucherData cartVoucher : voucher) {
	 * voucherFacade.releaseVoucher(cartVoucher.getVoucherCode()); }
	 * 
	 * modelService.save(cartService.getSessionCart()); promotionGroup =
	 * promotionsService.getPromotionGroup("asianpaintsPromoGrp"); final List<PromotionGroupModel> groups = new
	 * ArrayList<PromotionGroupModel>(); groups.add(promotionGroup); final Collection<PromotionGroupModel> collection =
	 * groups; promotionsService.updatePromotions(collection, cartService.getSessionCart(), false,
	 * AutoApplyMode.APPLY_ALL, AutoApplyMode.APPLY_ALL, new java.util.Date());
	 * modelService.refresh(cartService.getSessionCart()); } catch (final VoucherOperationException e) { // YTODO
	 * Auto-generated catch block System.out.println("Voucher Exception"); e.printStackTrace(); return
	 * REDIRECT_URL_ADD_PAYMENT_METHOD + "?Message=" + e.getMessage();
	 * 
	 * } return REDIRECT_URL_ADD_PAYMENT_METHOD + "?Message=Voucher Released Successfully"; }
	 */
}
