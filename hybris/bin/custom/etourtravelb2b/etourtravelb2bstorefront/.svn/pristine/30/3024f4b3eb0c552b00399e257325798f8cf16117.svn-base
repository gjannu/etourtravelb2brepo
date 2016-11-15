/**
 *
 */
package com.etourtravelb2b.storefront.forms.validator;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.validation.metadata.BeanDescriptor;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.etourtravelb2b.storefront.forms.Etourtravelb2bRegistrationForm;


/**
 * @author GJANNU
 *
 */

@Component("etourtravelRegistrationValidator")
public class Etourtravelb2bRegistrationValidator implements Validator
{


	private Pattern pattern;
	private Matcher matcher;

	@NotNull
	//@DateTimeFormat(pattern = "dd/MM/YY")
	private String currentLocation;
	private String contactNumber;
	public static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
	public String MOBILE_PATTERN = "[0-9]{10}";


	public boolean supports(final Class<?> aClass)
	{
		return Etourtravelb2bRegistrationForm.class.equals(aClass);
	}


	public void validate(final Object object, final Errors errors)
	{
		final Etourtravelb2bRegistrationForm registerForm = (Etourtravelb2bRegistrationForm) object;
		final String titleCode = registerForm.getTitleCode();
		final String firstName = registerForm.getFirstName();
		final String lastName = registerForm.getLastName();
		final String email = registerForm.getEmail();
		final String pwd = registerForm.getPwd();
		final String checkPwd = registerForm.getCheckPwd();
		final String contactNumber = registerForm.getContactNumber();
		final String currentLocation = registerForm.getCurrentLocation();


		if (StringUtils.isEmpty(titleCode))
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}
		else if (StringUtils.length(titleCode) > 255)
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}

		if (StringUtils.isBlank(firstName))
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}
		else if (StringUtils.length(firstName) > 255)
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}

		if (StringUtils.isBlank(lastName))
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}

		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
		}

		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}

		if (StringUtils.isEmpty(pwd))
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
		else if (StringUtils.length(pwd) < 6 || StringUtils.length(pwd) > 255)
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}

		if (StringUtils.isNotEmpty(pwd) && StringUtils.isNotEmpty(checkPwd) && !StringUtils.equals(pwd, checkPwd))
		{
			errors.rejectValue("checkPwd", "validation.checkPwd.equals");
		}
		else
		{
			if (StringUtils.isEmpty(checkPwd))
			{
				errors.rejectValue("checkPwd", "register.checkPwd.invalid");
			}
		}


		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber", "required.contactNumber");
		// phone number validation
		if (!(contactNumber != null && contactNumber.isEmpty()))
		{
			pattern = Pattern.compile(MOBILE_PATTERN);
			matcher = pattern.matcher(contactNumber);
			if (!matcher.matches())
			{
				errors.rejectValue("contactNumber", "register.contactNumber.invalid");
			}
		}
		if (StringUtils.isBlank(currentLocation))
		{
			errors.rejectValue("currentLocation", "register.currentLocation.invalid");
		}
		else if (StringUtils.length(currentLocation) > 255)
		{
			errors.rejectValue("currentLocation", "register.currentLocation.invalid");
		}

		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateOfBirth", "required.dateOfBirth", "dateOfBirth is required.");

		/*
		 * else if (StringUtils.isNumeric("0")) { errors.rejectValue("contactNumber", "register.contactNumber.invalid"); }
		 */

		/*
		 * else if (StringUtils.length(contactNumber) < 10 || StringUtils.length(contactNumber) < 10) {
		 * errors.rejectValue("contactNumber", "register.contactNumber.invalid"); }
		 */
	}

	public boolean validateEmailAddress(final String email)
	{
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#getConstraintsForClass(java.lang.Class)
	 */
	@Override
	public BeanDescriptor getConstraintsForClass(final Class<?> arg0)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#unwrap(java.lang.Class)
	 */
	@Override
	public <T> T unwrap(final Class<T> arg0)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#validate(java.lang.Object, java.lang.Class[])
	 */
	@Override
	public <T> Set<ConstraintViolation<T>> validate(final T arg0, final Class<?>... arg1)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#validateProperty(java.lang.Object, java.lang.String, java.lang.Class[])
	 */
	@Override
	public <T> Set<ConstraintViolation<T>> validateProperty(final T arg0, final String arg1, final Class<?>... arg2)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#validateValue(java.lang.Class, java.lang.String, java.lang.Object,
	 * java.lang.Class[])
	 */
	@Override
	public <T> Set<ConstraintViolation<T>> validateValue(final Class<T> arg0, final String arg1, final Object arg2,
			final Class<?>... arg3)
	{
		// YTODO Auto-generated method stub
		return null;
	}
}
