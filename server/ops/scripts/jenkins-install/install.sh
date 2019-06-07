
helm init
k apply -f rbac-config.yaml
helm init --service-account tiller --history-max 200
helm install --name jenkins --namespace jenkins -f demo-values.yaml stable/jenkins
printf $(kubectl get secret --namespace jenkins jenkins -o jsonpath="{.data.jenkins-admin-password}" | base64 --decode);echo
k get services --namespace jenkins
k port-forward service/jenkins --namespace=jenkins 8080
kubectl create clusterrolebinding jenkins --clusterrole cluster-admin --serviceaccount=jenkins:default
