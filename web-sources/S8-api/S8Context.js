
import { S8WebPage } from "./S8WebPage.js";
import { S8WebServer } from "./S8WebServer.js";


/**
 * Define the interface of the context
 */
export class S8Context {

    /**
     * @type{S8WebPage}
     */
    page = new S8WebPage();


    /**
     * @type{S8WebServer}
     */
    server = new S8WebServer();
}



/**
 * @type{ S8Context }
 */
export const S8 = new S8Context();