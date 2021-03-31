package com.university.professorservice.Client;

import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.instrument.grpc.SpringAwareManagedChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;


@Service
public class DepartmentClient {
    ManagedChannel departmentChannel;
    @Autowired
    SpringAwareManagedChannelBuilder springAwareManagedChannelBuilder;

    public ManagedChannel departmentChannel() {
        departmentChannel = springAwareManagedChannelBuilder.forTarget("localhost:9090")
                .usePlaintext().build();
        return departmentChannel;
    }

    @PreDestroy
    public void preDestroy() {
        shutDownDepartmentChannel();
    }

    private void shutDownDepartmentChannel() {
        if (departmentChannel != null) {
            departmentChannel.shutdown();
        }
    }
}
