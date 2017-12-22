////jshint strict: false
module.exports = function(config) {
 config.set({
   basePath: './',
   files: [
       'src/main/resources/static/bower_components/jquery/dist/jquery.js',

       'src/main/resources/static/bower_components/angular/angular.js',
       'src/main/resources/static/bower_components/angular-mocks/angular-mocks.js',
       'src/main/resources/static/bower_components/angular-resource/angular-resource.js',
       'src/main/resources/static/bower_components/angular-route/angular-route.js',
       'src/main/resources/static/bower_components/angular-animate/angular-animate.js',


       'src/main/resources/static/**/*.module.js',
       //'src/test/javascript/**/*.module.js',

       'src/main/resources/static/*!(.module|.spec).js',
       //'src/test/javascript/*!(.module|.spec).js',

       'src/main/resources/static/!(bower_components)/**/*!(.module|.spec).js',
       //'src/test/javascript/!(bower_components)/**/*!(.module|.spec).js',

       //'src/main/resources/static/**/*.spec.js'
       'src/test/javascript/**/*.spec.js'
       //'src/test/javascript/**/**/*.spec.js'

   ],
     reporters: ['progress'],
     singleRun: true,
   // autoWatch: true,
   frameworks: ['jasmine'],
   browsers: ['PhantomJS'],
   plugins: [
     // 'karma-chrome-launcher',
     // 'karma-firefox-launcher',
       'karma-phantomjs-launcher',
     'karma-jasmine'
   ],
     logLevel: config.LOG_DEBUG

 });
};