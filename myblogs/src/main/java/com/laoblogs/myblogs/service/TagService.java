package com.laoblogs.myblogs.service;


import com.laoblogs.myblogs.entity.BlogTagCount;
import com.laoblogs.myblogs.util.PageQueryUtil;
import com.laoblogs.myblogs.util.PageResult;

import java.util.List;

public interface TagService {

    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
