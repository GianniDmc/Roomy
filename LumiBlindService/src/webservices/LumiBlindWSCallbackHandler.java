
/**
 * LumiBlindWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package webservices;

    /**
     *  LumiBlindWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class LumiBlindWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public LumiBlindWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public LumiBlindWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getBlindState method
            * override this method for handling normal response from getBlindState operation
            */
           public void receiveResultgetBlindState(
                    webservices.LumiBlindWSStub.GetBlindStateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBlindState operation
           */
            public void receiveErrorgetBlindState(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getLuminosity method
            * override this method for handling normal response from getLuminosity operation
            */
           public void receiveResultgetLuminosity(
                    webservices.LumiBlindWSStub.GetLuminosityResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLuminosity operation
           */
            public void receiveErrorgetLuminosity(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    