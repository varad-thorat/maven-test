# maven-test

--------Expt 8--------
##Docker Commands##
//install docker
sudo apt install curl
curl -fsSL https://get.docker.com -o get-docker.sh

//run whalesay
sudo su
docker pull docker/whalesay
docker images
docker run docker/whalesay cowsay hello_you
docker pull bushsk/ngnix_webapp:v1
docker run -itd --name shreyash 8989:80 bushsk/ngnix_webapp:v1
//test at localhost://8283
docker images
docker pull ubuntu:latest
docker images
docker run -it ubuntu:latest bash 
apt update 
apt install apache2
cd /var/www/html
mv index.html index.backup
ls
apt install nano
nano index.html
//paste this in nano
<html>
<title> First page</title> <body bgcolor="pink"> Our home Page </body> </html>
service apache2 start
service apache2 status
//go to other terminal
sudo su
docker images
//take the id of ubuntu which u pulled earlier and user other name instead of shreyash/ub_apache:v1
docker tag a8780b506fa4 shreyash/ub_apache:v1
docker images
docker ps
//take container id of ubuntu:latest
docker commit d9658a294217 shreyash/ub_apache:v1
docker images
ufw allow 8283
docker ps
docker run -itd -p 8283:80 --name test shreyash/ub_apache:v1
// test at localhost://8283

//docker push part
//login in hub
//login in terminal
docker login
docker push shreyash/ub_apache:v1

//stopping the container using container id
docker ps
//take container id from abover command
docker stop <container-id>
docker kill <container-id>
docker rm <container-id>

//removing image
docker rmi <container-id>
  

  
--------Expt 9----------
##Dockerfile Instructions##
mkdir 120A3053
cd 120A3053
nano Dockerfile
//paste below code
FROM ubuntu:latest
MAINTAINER "SHREYASH"
RUN apt update -y
RUN apt install nginx -y
EXPOSE 80
COPY index.html /var/www/html/index.html
CMD ["nginx", "-g", "daemon off;"]
//back in terminal
sudo docker build -t testfile2 .
sudo su
docker run -itd -p 8089:80 testfile2
docker ps
//take containder id from above command
docker commit 659e1f7ed627 shreyash/docker-test:v1
docker login

  
//docker volume
docker volume create vol1
docker volume inspect vol1
ls /var/lib/docker/volumes/vol1/_data
docker images
docker run -it -p 8050:80 --mount source=vols,target=/var/www/html/ bushsk/ngnix_webapp:v1 bash
ls /var/www/html/
  
--------expt 7-------
//puppet
sudo su
hostnamectl set-hostname puppet-master
hostname 
exit
sudo su  
ifconfig
//take inet from ifconfig
//in other pc run below command
echo $(hostname -I) $(hostname)
//take ip from above command
  
// in your pc run following command
nano /etc/host
//this will open nano. inside nano in last line, add following
//<ip address of puppet agent>   puppet-agent
ping puppet-agent









