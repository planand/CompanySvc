package com.example.companydemo.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAudit {
    @CreatedDate
    @Column(updatable = false)
    protected String createdTime;

    @LastModifiedDate
    @Column
    protected String updatedTime;

    @CreatedBy
    protected String createdBy;

    @LastModifiedBy
    protected String updatedBy;
}
