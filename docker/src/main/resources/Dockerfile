FROM primetoninc/jdk:latest

ENV APP_PATH=/var/lib/app
ENV APP_CONF=/etc/app/config
ENV PATH ${APP_PATH}:/usr/local/bin:$PATH

RUN set -x && \
    mkdir -p ${APP_PATH} && \
    mkdir -p ${APP_CONF} && \
    mkdir -p /var/log/app_log

COPY *.sh ${APP_PATH}
COPY business-demo-app.jar ${APP_PATH}/business-demo-app.jar

RUN set -x && \
    chmod -R +x ${APP_PATH}/*.sh;
#    \
#    groupadd -r appuser -g 1024; \
#    useradd -r -g appuser appuser -u 1024; \
#    echo appuser:YWRtaW5pc3RyYXRvcg== | chpasswd && \
#    chown -R appuser:appuser "${APP}" && \
#    chown -R appuser:appuser "${APP_CONF}" && \
#    chown -R appuser:appuser "/var/log/appA_log"

# EXPOSE 8088
# USER appuser

RUN set -x && echo $PATH
WORKDIR ${APP_PATH}
CMD ["start.sh"]