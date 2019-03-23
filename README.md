# angular7-springboot
This project packages an angular7 project inside a springboot application.

Changes to be made in angular Application

1) Need to add additional script in package.json

``
  "scripts": {
    ...
    "prod": "ng build --prod",
    ...
    }
``

2) Add a proxy.conf file in the root directory of angular project

``
{
    "/api": {
        "target": "http://localhost:8080",
        "secure": false,
        "pathRewrite": {
            "^/api": ""
        }
        "changeOrigin": true
    }
}
``

3) Add pom.xml in all the modules as mentioned in this git project

## How it works?
When we build the project from the root directory, the angular project is built and then it is added as a dependency in the 'SupportSpringboot' project.

Therefore when we run the jar package of the SupportSpringboot project, the angular site can be accessed in ``http:localhost:8080``

For more information mail me at imsidharthan@gmail.com
