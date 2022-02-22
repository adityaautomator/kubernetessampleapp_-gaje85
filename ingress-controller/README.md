# Architecture

![Alt text](architecture.png?raw=true "Title")


# Steps to create cluster

 eksctl create cluster --name=<clustername> --node-type=t2.medium --full-ecr-access --nodes-min=1 --nodes-max=2 --region=us-east-2

#### Create Hosted zone in Route53

* Hosted Zone: name must be same as your domain name(eg.,testleaftraining.com)
* Create as public hosted zone

#### AWS Certification

* Get certificate for all subdomains like *.testleaftraining.com
* Request public certificate give name as *.domainname and validation as DNS validation 
* After request view the certificate and create given CNAME record in route53 hosted zone that you have created.
* Validation is Successful within 15-30 minutes.


####Deploy all microservices

* Deploy all service through jenkins build
```
kubectl  get pods --all-namespaces
kubectl  get svc  --all-namespaces
kubectl  get ingress --all-namespaces
```

##### Create Resource for ingress controller
```
kubectl  apply -f resource.yaml
```

##### Create ConfigMap and nginx config

```
kubectl  apply -f configmap.yaml
```

##### Create Classic Load balancer

*add certificate id in ssl-cert in loadbalancer.yaml 
```
kubectl  apply -f loadbalancer.yaml
```


##### Change DNS alias in route53 for classic load balancer

* Create a 'A' record in aws hosted zone for all subdomain(eg.,*.testleaftraining.com)
* change value to alias and click alias to classic and application load balancer and select region and select load balancer

##### Create Ingress Rules 

 
```
kubectl  apply -f ingress-rules.yaml
```
