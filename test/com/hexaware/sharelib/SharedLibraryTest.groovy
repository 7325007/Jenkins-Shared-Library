package com.hexaware.sharelib;

class SharedLibraryTest extends GroovyTestCase {
  void testStartBuild() {
    def sharedLibrary = new sharedLibrary([
      echo: { String message ->
          assert message == "Hello, World!"
          println(message)        
      }
    ])
    sharedLibrary.startBuild()
  }
}
