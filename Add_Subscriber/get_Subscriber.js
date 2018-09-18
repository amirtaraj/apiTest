var base_url = require('../utils/Endpoints');
var clientID = require('../utils/Client_ID')
var zipcode = require('../utils/Zipcode')
var chai = require('chai');
var expect = require('chai').expect;
var should = require('should');
chai.should();  
chai.use(require('chai-http'));
var request = require('request');
var fs = require('fs')
var now = new Date();
var dateTime = now.getHours +"-" + now.getMinutes + "-" + now.getSeconds + "-" + now.getMilliseconds;
chai.request;
//var token = require('../utils/token')
var token = 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjdfWnVmMXR2a3dMeFlhSFMzcTZsVWpVWUlHdyIsImtpZCI6IjdfWnVmMXR2a3dMeFlhSFMzcTZsVWpVWUlHdyJ9.eyJhdWQiOiI1YWVlNWNlYS01ZTc4LTRhMjItOGNiMS01ZWFmNjRhMTZmM2EiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC84MjA3MzUzNS0zODc3LTQwY2UtODU4YS1lOWQzMGFjYzk0MTkvIiwiaWF0IjoxNTM2NzM2NzUzLCJuYmYiOjE1MzY3MzY3NTMsImV4cCI6MTUzNjc4MDI1MywiYWlvIjoiNDJCZ1lJaW8zK3N1cE1XOVcrZWd4UGZNK3pFbUFBPT0iLCJhcHBpZCI6IjVhZWU1Y2VhLTVlNzgtNGEyMi04Y2IxLTVlYWY2NGExNmYzYSIsImFwcGlkYWNyIjoiMSIsImVfZXhwIjozMDI0MDAsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzgyMDczNTM1LTM4NzctNDBjZS04NThhLWU5ZDMwYWNjOTQxOS8iLCJvaWQiOiJkZDQ1OGY2Zi1kZTBkLTQyZmUtYjNiOS0zZDdjODM1M2Q4MjIiLCJzdWIiOiJkZDQ1OGY2Zi1kZTBkLTQyZmUtYjNiOS0zZDdjODM1M2Q4MjIiLCJ0aWQiOiI4MjA3MzUzNS0zODc3LTQwY2UtODU4YS1lOWQzMGFjYzk0MTkiLCJ1dGkiOiJxNlpLZkp1UFlVbXRmZFJzLThVakFBIiwidmVyIjoiMS4wIn0.ThDr1SulpQrVvpUg5q_nl5udevB9bvQoTWQD5SWOGzAPcUUd8mSKftyBfZLbiyFknh544AUvMzMR2DKrA6V0mtkFKIA8MTVo733c-uxEe4OGPySe5wSlvOoRxQ5ErB1ov5cQojoR-TW-2mJJaVxZXjf1XngIlW95687tiFSbPym-oSpZnpErp9CMF7qF5teqhP0tYfZwMaOac7rCJwkWFuNj3SbqFBwD0_vP8GHJzgIzYgQCTxIxrLiK5vMIbzARUv_lvmeYy2FKQrNXjmGYh-4GPjkEA8IV0My0gUHi2ARYfsQseiu6sLM6Z6IzKXErRzxSkC0L0Sy544O3tGydcQ';



describe ("Validate GET for subscriber/client/product",function(){
    this.timeout(5000);

    it("should get all detils of susbscriber", function() {
        return chai.request(base_url.SUBSCRIBER_SEARCH)
        .get('/324546545')
        .set('Authorization',token)
        .then ( function(res){
            expect(res).to.have.status(200)
            expect(res).to.be.json
            var response = res.body;
           // console.log(res.body)
            fs.appendFileSync('./responses_1.json' , JSON.stringify(response))
        })
    })

    it("should get all details of client" , function(){
        return chai.request(base_url.CLIENT_SEARCH)
        .get(clientID.clientID2)
        .set('Authorization',token)
        .then(function(res){
            expect(res).to.have.status(200)
            expect(res).to.be.json
            var response = res.body
            fs.appendFileSync('./responses_2.json', JSON.stringify(response) )
           // fs.writeFileSync('../responses' ,JSON.stringify(response))
            // console.log(res.status)
            // console.log(res.header)
            // console.log(res.body)  
            //console.log(JSON.stringify(res))

        })
    })

    it("should get all details of zipcode" , function() {
        return chai.request(base_url.ZIPCODE_URL)
        .get(zipcode.zipcode1)
        .set('Authorization',token)
        .then( function(res) {
            var response = res.body;
            fs.appendFileSync('./responses_3.json',JSON.stringify(response) )
            // console.log(res.status)
            // console.log(res.header)
            // console.log(res.body)
        })
    })
})