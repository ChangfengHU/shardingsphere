package com.hcf.config;


import com.hcf.dal.mapper.nosharding.ShardConfigMapper;
import com.hcf.dal.model.ShardConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by xiang.wei on 2019/5/6
 *
 * @author xiang.wei
 */
@Data
@Slf4j
@Service("preciseModuloTableShardingAlgorithm")
public class CommonTableShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    @Autowired
    private ShardConfigMapper shardConfigMapper;


    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String physicsTable = null;
        physicsTable=setValue(preciseShardingValue);
        if (StringUtils.isBlank(physicsTable)) {
            for (String value : collection) {
                physicsTable = value;
                break;
            }
        }
        return physicsTable;
    }

    /**
     * @param preciseShardingValue
     * @return
     */
    protected String setValue(PreciseShardingValue<String> preciseShardingValue) {
        String substring = preciseShardingValue.getValue().substring(0, 4);
        ShardConfig config = shardConfigMapper.selectByPrimaryKey(substring);
        if (config != null) {
            // TODO: 2019/5/8 需要调整
            String[] split = config.getConfigValue().split(",");
            return preciseShardingValue.getLogicTableName() + "_" + split[1];
        }
        return null;
    }

}
