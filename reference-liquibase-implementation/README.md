# helm-starter

Helm starter templates for Kubernetes, Istio configurations

## Features

- Creates the following Kubernetes and Istio objects
  - Deployment
  - Service
  - VirtualService
  - DestinationRule
  - ServiceRole
  - ServiceRoleBinding

## Installation

- Delete any existing installation

```sh
> rd /s /q %HOMEPATH%\.helm\starters\wawa\helm-starter
```

- Clone the template using

```sh
> git clone https://github.com/wawa/helm-starter %HOMEPATH%\.helm\starters\wawa\helm-starter
```

## Usage

```sh
# Set the application name
> $env:APPNAME = "wawa-reference-api-app"
# Remove any existing helm starters
> rm -r -fo $env:HOMEPATH\.helm\starters\wawa\helm-starter
# Get the latest version of helm starters
> git clone https://github.com/wawa/helm-starter $env:HOMEPATH\.helm\starters\wawa\helm-starter
# Create a helm chart using the starter
> helm create $env:APPNAME --starter=wawa/helm-starter
# Replace place holders
> gci -r -include "*.yaml" | foreach-object { $a = $_.fullname; ( get-content $a ) | foreach-object { $_ -replace "<CHARTNAME>", $env:APPNAME }  | set-content $a }
```

> replace wawa-reference-api-app with the name of the application, typically this is same as the Git repo name

> **Change the parameters in the generated values.yaml and virtual-service.yaml**
> Refer [Edit the generated files](https://wawaappdev.atlassian.net/wiki/spaces/KM/pages/330957449/Helm) for detailed instructions.
