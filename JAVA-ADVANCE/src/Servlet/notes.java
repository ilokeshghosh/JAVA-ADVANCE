package Servlet;

public class notes {
    /*
    Website : A collection of static file i.e html pages images, graphics.

    Web Application : It is a website with dynamic functionality on the server


    # http is said to be stateless protocol i.e it support one request per connection
        that means a client connect to server to send one request and then disconnect this mechanism
        allows more user to connect to a given server over a period of time


   What is Servlets?
   -> A servlet is a Java Programming language class that is used to extend the capabilities of servers that
      host applications accessed by means of request-response programming.It is robust and scalable

   Uses of servlets
   1)Creates Web Application
   2)Provides Interfaces and class
   3)Must be implemented to create Servlet
   4)Responds to any incoming requests
   5)Deployed to create Web Page



  ** Servlet Life Cycle **

   start-------------------------->Loading and instantiation
                                        |
                                       \|/
                                        | init()
                                        |
                 |------>-->---->----Initialized
    End of       |                     \|/
    Request     /|\                     | service()
    thread       |                      |
                 |-<-------<----------Handling Request
                                        |
                                       \|/
                                        | destroy()
                                        |
    Stop<------------------<----------<End


Steps to create simple Servlet
1.Create and compile simple servlet code
2.Add mapping to web.xml file
3.Start Apache TomCat
4.Start Web Browser and request servlet


     */
}
