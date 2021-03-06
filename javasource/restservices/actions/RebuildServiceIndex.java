// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.RestServices;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class RebuildServiceIndex extends CustomJavaAction<Boolean>
{
	private IMendixObject __serviceDefinition;
	private restservices.proxies.ServiceDefinition serviceDefinition;

	public RebuildServiceIndex(IContext context, IMendixObject serviceDefinition)
	{
		super(context);
		this.__serviceDefinition = serviceDefinition;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.serviceDefinition = __serviceDefinition == null ? null : restservices.proxies.ServiceDefinition.initialize(getContext(), __serviceDefinition);

		// BEGIN USER CODE
		RestServices.getService(serviceDefinition.getName()).getChangeLogManager().rebuildChangeLog();
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "RebuildServiceIndex";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
