

/**
 * Define the interface of the context
 */
export class S8WebPage {

    /**
     * Use this method to load CSS file on the page
     * 
     * @param {string} name 
     * @returns {void}
     */
    CSS_import(name) {
        /* to be overridden */
        console.log(name);
    }


    /**
     * 
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
     * 
     * @param {HTMLElement} target 
     * @param {string} name 
     * @param {number} width 
     * @param {number} height 
     * @returns {void}
     */
    SVG_insertByName(target, name, width, height) {
        /* to be overridden */
        console.log(`insert SVG ${target} withe ${name} (${width} x ${height})`);
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
     * 
     * @param {HTMLElement} node 
     * @returns {void}
     */
	setRoot(node) {
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