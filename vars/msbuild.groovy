void call(String solution, String targetFrameworkVersion) {
    env.WORKSPACE = pwd()
    String msbuild = 'C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\MSBuild.exe'
    Boolean exitStatus = bat(returnStatus: true, script: "${msbuild} ${env.WORKSPACE}\\${solution} -toolsVersion:${targetFrameworkVersion}")

    if (exitStatus != 0) {
        currentBuild.result = 'FAILURE'
    }
}
