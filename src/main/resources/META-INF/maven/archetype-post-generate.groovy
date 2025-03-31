def rootDirectory = new File(request.getOutputDirectory(), request.getArtifactId())

def preCommit = new File(rootDirectory,"githooks/pre-commit")
preCommit.setExecutable(true, false)

def mvnWrapper = new File(rootDirectory,"mvnw")
mvnWrapper.setExecutable(true, false)

