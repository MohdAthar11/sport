/**
 * 
 */
package com.cricinfo.entity;

/**
 * @author I340660
 *
 */
public class Format {

	    private String id;
		private String name;
		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Format [id=" + id + ", name=" + name + "]";
		} 
		
}
