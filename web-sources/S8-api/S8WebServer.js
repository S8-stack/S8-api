

/**
 * Define the interface of the context
 */
export class S8WebServer {

   

    /**
     * 
     * @param {string} requestPath 
     * @param {string} responseType 
     * @param {Function} responseCallback 
     */
    sendRequest_HTTP2_GET(requestPath, responseType, responseCallback) {

        /* to be overridden */
        console.log(`GET: ${requestPath} for ${responseType}, then ${responseCallback}`);
    }


    /**
     * @param {ArrayBuffer} requestArrayBuffer 
     * @param {Function} responseCallback 
     */
    sendRequest_HTTP2_POST(requestArrayBuffer, responseCallback) {

        /* to be overridden */
        console.log(`POST: ${requestArrayBuffer} = ${responseCallback}`);
    }

}