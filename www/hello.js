var exec = require('cordova/exec');

module.exports = function(str, callback){
    exec(callback, function(err) {
            callback('Nothing to echo.');
        }, "Hello", "echo", [str]);
};
