package de.spqr.activitisoapclient.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * Entity class of a part you need to build a car
 * @author said
 */
@Entity
public class BackWindow implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    
	private int backWindowID;
	private String producer;

	public BackWindow() {
	}

    public int getBackWindowID() {
        return backWindowID;
    }

    public void setBackWindowID(int backWindowID) {
        this.backWindowID = backWindowID;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BackWindow)) {
            return false;
        }
        BackWindow other = (BackWindow) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.spqr.activitiderbysoapservice.entity.BackWindow[ id=" + id + " ]";
    }
    
}
