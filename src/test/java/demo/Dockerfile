FROM node
LABEL dfkononov@gmail.com
LABEL description="Docker image for a Todo application using Node.js"
RUN git clone -q https://github.com/docker-in-practice/todo.git
WORKDIR todo
RUN npm install > /dev/null
EXPOSE 8000
CMD ["npm","start"]
