var endpoints = function(){

    this.SUBSCRIBER_URL = "https://sisc-subscriptionapi-qa.azurewebsites.net/api/v1/subscription/"
    this.CLIENT_URL = "https://sisc-productsapi-qa.azurewebsites.net/api/v1/products/"
    this.PRODUCT_URL = "https://sisc-productsapi-qa.azurewebsites.net/api/v1/products/"
    this.SUBSCRIBER_SEARCH = "https://sisc-subscriptionapi-qa.azurewebsites.net/api/v1/subscription/search/searchbyssntaxid/"
    this.CLIENT_SEARCH = "https://sisc-productsapi-qa.azurewebsites.net/api/v1/products/clientplans/active/"
    this.ZIPCODE_URL = "https://sisc-subscriptionapi-qa.azurewebsites.net/api/v1/subscription/zipcode/getzipcodeInfo/"
    //this.PRODUCR_SEARCH = "https://sisc-productsapi-qa.azurewebsites.net/api/v1/products/clientplans/active/"




}

module.exports = new endpoints;