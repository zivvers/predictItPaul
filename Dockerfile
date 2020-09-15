FROM zenika/alpine-maven
RUN apk update \
	&& apk add ca-certificates wget \
	&& update-ca-certificates

RUN apk add vim

ENV workpath /usr/src/app/PredictItPaul/src/main/scala/com/

RUN mvn archetype:generate -B \
    -DarchetypeGroupId=net.alchim31.maven -DarchetypeArtifactId=scala-archetype-simple -DarchetypeVersion=1.7 \
    -DgroupId=com.predictItPaul -DartifactId=PredictItPaul -Dversion=0.1-SNAPSHOT -Dpackage=com.predictItPaul
WORKDIR /usr/src/app/PredictItPaul 
RUN rm pom.xml
RUN rm src/test/scala/samples/*