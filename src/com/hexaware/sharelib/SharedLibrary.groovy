package com.hexaware.shredlib

public class SharedLibrary {
def steps

  public SharedLibrary(steps) {
    this.steps = steps
  }

  public void startBuild() {
    steps.echo "Hello, World!"
  }
}
