/**
 * 
 */
package module.protocols.dto;

import java.io.Serializable;

import module.organization.domain.OrganizationalModel;
import module.protocols.domain.ProtocolManager;

/**
 * @author Joao Carvalho (joao.pedro.carvalho@ist.utl.pt)
 * 
 */
public class ProtocolSystemConfigurationBean implements Serializable {

    private static final long serialVersionUID = 2000558610665541013L;

    private OrganizationalModel internalOrganizationalModel;

    private OrganizationalModel externalOrganizationalModel;

    public ProtocolSystemConfigurationBean() {

        ProtocolManager manager = ProtocolManager.getInstance();

        this.internalOrganizationalModel = manager.getInternalOrganizationalModel();
        this.externalOrganizationalModel = manager.getExternalOrganizationalModel();
    }

    public OrganizationalModel getInternalOrganizationalModel() {
        return internalOrganizationalModel;
    }

    public void setInternalOrganizationalModel(OrganizationalModel internalOrganizationalModel) {
        this.internalOrganizationalModel = internalOrganizationalModel;
    }

    public OrganizationalModel getExternalOrganizationalModel() {
        return externalOrganizationalModel;
    }

    public void setExternalOrganizationalModel(OrganizationalModel externalOrganizationalModel) {
        this.externalOrganizationalModel = externalOrganizationalModel;
    }

}
