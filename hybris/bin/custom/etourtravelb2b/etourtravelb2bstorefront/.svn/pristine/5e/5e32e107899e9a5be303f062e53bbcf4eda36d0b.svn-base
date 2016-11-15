<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

  <%-- <c:url value="/coming-soon/products" var ="productpage"/>
<c:url value="/coming-soon/products/Save" var="saveCustomerData"/> 
 --%> 
<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages/>
	</div>

	<div id="productNotifyDiv">
		<ol class="products-list" data-isOrderForm="false">
		
			<c:forEach items="${produtList}" var="product">
				
				<div class="head">
				${product.name}</br>
				<img src="${product.thumbnail.url}"></br>
				</div>
			
		   </c:forEach>
		</ol>
		<div>
		<input type="text" id="resultTextID" style="display: none; border: none ; color: red;font-size: 20px;" readonly="readonly"/>
		</div>
	</div>
	
	<script type="text/javascript" src="${commonResourcePath}/js/jquery-1.11.2.min.js"></script>
	
		
		
	
</template:page>