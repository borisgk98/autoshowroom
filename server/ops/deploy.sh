#!/bin/sh

files=$(find ./k8s/default -name "*.yaml")
for file in $files
do
	envsubst < $file | kubectl --namespace=default apply -f -
done