/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luiz.grenteski
 */
public class Post {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    /**
     * Construtor Padrão
     */
    public Post() {
    }
    
    /**
     * Construtor com todos os parâmetros
     * @param moment
     * @param title
     * @param content
     * @param likes 
     */
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    
    /**
     * Retorna o momento
     * @return 
     */
    public Date getMoment() {
        return moment;
    }
    
    /**
     * Seta o momento
     * @param moment 
     */
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    
    /**
     * Retorna o título
     * @return 
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Seta o título
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Retorna o conteúdo
     * @return 
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Seta o conteúdo
     * @param content 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Retorna as curtidas
     * @return 
     */
    public Integer getLikes() {
        return likes;
    }
    
    /**
     * Seta as curtidas
     * @param likes 
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * Retorna os comentários
     * @return 
     */
    public List<Comment> getComments() {
        return comments;
    }
    
    /**
     * Adiciona um comentário
     * @param comment 
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }
    
    /**
     * Remove um comentário
     * @param comment 
     */
    public void removeComment(Comment comment){
        comments.remove(comment);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Comments:").append("\n");
        
        for(Comment c : comments){
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
