

/**
 * 
 * @abstract
 * @type{S8Page}
 * Define the interface of the context
 */
export class S8Page {

    /**
     * Use this method to load CSS file on the page
     * 
     * @abstract
     * @param {string} name 
     * @returns {void}
     */
    CSS_import(name) {
        /* to be overridden */
        console.log(name);
    }


    /**
     * @abstract
     * @param {HTMLElement} target 
     * @param {number} code 
     * @param {number} width 
     * @param {number} height 
     * @returns {void}
     */
    SVG_insertByCode(target, code, width, height) {
        /* to be overridden */
        console.log(`insert SVG ${target} withe ${code} (${width} x ${height})`);
    }


    /**
     * @abstract
     * @param {HTMLElement} target 
     * @param {string} pathname 
     * @param {number} width 
     * @param {number} height 
     * @returns {void}
     */
    SVG_insertByPathname(target, pathname, width, height) {
        /* to be overridden */
        console.log(`insert SVG ${target} withe ${pathname} (${width} x ${height})`);
    }


    /**
     * Efficiently remove children nodes of a node
     * @param {HTMLElement} node 
     * @returns {void}
     */
    removeChildren(node) {
        /* to be overridden */
        console.log(node);
    }



    /**
     * @abstract
     * @param {HTMLElement} node 
     * @returns {void}
     */
	HTML_setRootElement(node) {
		 /* to be overridden */
         console.log(node);
	}




    /**
	 * 
	 * @param {Object} object 
	 */
	setFocusOn(object) {
        /* to be overridden */
        console.log(object);
	}
    

	/**
	 * 
	 */
	loseFocus(){
		console.log("To be overridden");
	}

}