
import { S8Page } from "./S8Page.js";
import { S8Server } from "./S8Server.js";


/**
 * Define the interface of the context
 */
export class S8Context {

    /**
     * @type{S8Page}
     */
    page = new S8Page();


    /**
     * @type{S8Server}
     */
    server = new S8Server();
}



/**
 * @type{ S8Context }
 */
export const S8 = new S8Context();