package pl.jaworskimateusz.machineservice.mappers

import pl.jaworskimateusz.machineservice.data.entity.Service
import pl.jaworskimateusz.machineservice.dto.ServiceDto

class ServiceMapper {
    companion object {
        fun mapToServiceDto(service: Service): ServiceDto {
            return ServiceDto(
                    service.serviceId,
                    service.date,
                    service.componentName,
                    service.description,
                    service.result,
                    service.machineId
            )
        }

        fun mapToService(service: ServiceDto): Service {
            return Service(
                    service.serviceId,
                    service.date,
                    service.componentName,
                    service.description,
                    service.result,
                    service.machineId
            )
        }
    }
}
