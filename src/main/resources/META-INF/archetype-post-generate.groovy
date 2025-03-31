def rootDirectory = new File(request.getOutputDirectory(), request.getArtifactId())

def preCommit = new File(rootDirectory,"githooks/pre-commit")
preCommit.setExecutable(true, false)

def gitIgnore = new File(rootDirectory,"gitignore")
gitIgnore.renameTo(new File(rootDirectory,".gitignore"))
