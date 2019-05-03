package lv.tsi.forum.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TopicEntity {
    @Id
    @GeneratedValue
    Long id;
    String title;
    String description;

    @OneToMany
    @JoinColumn(name = "topicId")
    private List<PostEntity> postEntityList;

    public TopicEntity() {
    }

    public TopicEntity(Long id, String title, String description, List<PostEntity> postEntityList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.postEntityList = postEntityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PostEntity> getPostEntityList() {
        return postEntityList;
    }

    public void setPostEntityList(List<PostEntity> postEntityList) {
        this.postEntityList = postEntityList;
    }
}
