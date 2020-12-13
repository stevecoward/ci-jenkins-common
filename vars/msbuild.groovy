void call(String solution, String targetFrameworkVersion) {
    String msbuild = 'C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\MSBuild.exe'
    Boolean exitStatus = bat(returnStatus: true, script: "${msbuild} ${solution} -toolsVersion:${targetFrameworkVersion}")

    if (exitStatus != 0) {
        currentBuild.result = 'FAILURE'
    }
}
