package org.open_library_project.be.book.model.dto.book.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookCreateRequest {
    private String name;
    private Integer pageSize;
}
