var random = function() {

    this.nineDigits =function(){

    var nine_numbers= Math.floor(Math.random() * 999999999) + 000000000;
      return nine_numbers.toString();
    }
}

module.exports = new random;