/**
* Author: DatDoan
* Created Date: Apr 7, 2018
*/
package cs544.extra_credit_w1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TASK")
public class Task {
  @Id
  @GeneratedValue
  @Column(name = "ID")
  private int id;
  
  @Column(name = "STATUS")
  @Enumerated(EnumType.STRING)
  private TaskStatusEnum status;
  
  @Column(name = "START_DATE")
  @Temporal(TemporalType.TIMESTAMP)
  private Date startDate;
  
  @Column(name = "END_DATE")
  @Temporal(TemporalType.TIMESTAMP)
  private Date endDate;
  
  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "PROJECT_ID")
  private Project project;
  
  @OneToMany(mappedBy="task", cascade = CascadeType.ALL)
  private List<TaskResource> taskResources = new ArrayList<>();

  @OneToMany(mappedBy="task", cascade = CascadeType.ALL)
  private List<TaskVolunteer> taskVolunteers = new ArrayList<>();
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public TaskStatusEnum getStatus() {
    return status;
  }

  public void setStatus(TaskStatusEnum status) {
    this.status = status;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public List<TaskResource> getTaskResources() {
    return taskResources;
  }

  public void setTaskResources(List<TaskResource> taskResources) {
    this.taskResources = taskResources;
  }

  public List<TaskVolunteer> getTaskVolunteers() {
    return taskVolunteers;
  }

  public void setTaskVolunteers(List<TaskVolunteer> taskVolunteers) {
    this.taskVolunteers = taskVolunteers;
  }

}
