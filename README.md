# predictItPaul

Build project:
```
sudo docker-compose build
```

Run project (detached):
```
sudo docker-compose up -d
```

Connect to worker (for development purposes, e.g. run maven commands):
```
sudo docker exec -it $(sudo docker ps --filter NAME=predictitpaul_worker -aq) /bin/sh
```

Kill the worker:
```
sudo docker kill $(sudo docker ps -aq --filter NAME=predictitpaul_worker -aq)
```

Useful maven commands:
- compile: `mvn scala:compile`


