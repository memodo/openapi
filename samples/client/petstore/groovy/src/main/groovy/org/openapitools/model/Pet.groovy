package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Category;
import org.openapitools.model.Tag;

@Canonical
class Pet {
    
    Long id
    
    Category category
    
    String name
    
    List<String> photoUrls = new ArrayList<>()
    
    List<Tag> tags
    /* pet status in the store */
    String status
}
