package org.example.entity;

import lombok.Data;
import org.example.dictionary.ActionType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import java.time.OffsetDateTime;

@Data
@MappedSuperclass
public abstract class BusinessEntity {
    
    @Column(name = "create_dttm")
    private OffsetDateTime createDttm;
    @Column(name = "modify_dttm")
    private OffsetDateTime modifyDttm;
    @Column(name = "action_ind")
    @Enumerated(EnumType.STRING)
    private ActionType actionInd;
    @Column(name = "delete_dttm")
    private OffsetDateTime deleteDttm;
    @PrePersist
    public void prePersist() {
        this.createDttm = OffsetDateTime.now();
        this.modifyDttm = this.createDttm;
        this.actionInd = ActionType.I;
    }
    @PreUpdate
    public void preUpdate() {
        this.modifyDttm = OffsetDateTime.now();
        this.actionInd = ActionType.U;
    }
    @PreRemove
    public void preRemove() {
        this.modifyDttm = OffsetDateTime.now();
        this.deleteDttm = this.modifyDttm;
        this.actionInd = ActionType.D;
    }
}
