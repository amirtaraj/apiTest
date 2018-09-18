var token = function() {
    var AuthenticationContext = require('adal-node').AuthenticationContext;
 
    var clientId = '5aee5cea-5e78-4a22-8cb1-5eaf64a16f3a';
    var clientSecret = 'gUNQJvWe2Fd1hkDvZbkQdUlCVwT3ouVM+kLeE03Tq9o='
    var authorityHostUrl = 'https://login.microsoftonline.com/';
    var tenant = 'hear2dev.onmicrosoft.com';
    
   this.accessToken = function getAccessToken() {
        var result;
      //  ExecutorService service == null;
        var service = new ExecutorService;
        //var authorityUrl = new AuthenticationContext();
        try {
    
            service = Executors.newFixedThreadPool(1);
            var authorityUrl = authorityHostUrl  + tenant + "/oauth2/authorize";
            var authContext = new AuthenticationContext(authorityUrl, false,service);
            var clientCred = new ClientCredential(clientId,clientSecret);
           // clientCred = new ClientCredential(clientId,clientSecret);
            Future<AuthenticationResult> future == authContext.acquireToken(
                clientId,clientCred,null)
                result = future.get().getAccessToken();
            }
            finally {
                service.shutdown();
            }
            if(result === null) {
                throw new ServiceUnavailableException (
                    "authentication null"
                )
           
            }
           
            return result;
        }
       
    }
module.exports = new token;