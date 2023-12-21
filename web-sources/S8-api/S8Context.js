
import { S8WebPage } from "./S8WebPage.js";
import { S8WebServer } from "./S8WebServer.js";


/**
 * Define the interface of the context
 */
export class S8Context {

    /**
     * @type{S8WebPage}
     */
    page = null;


    /**
     * @type{S8WebServer}
     */
    server = null;
}



/**
 * @type{ S8Context }
 */
export const S8 = new S8Context();