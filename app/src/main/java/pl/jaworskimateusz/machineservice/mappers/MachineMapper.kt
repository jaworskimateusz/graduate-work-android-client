package pl.jaworskimateusz.machineservice.mappers

import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.dto.MachineDto

class MachineMapper {
    companion object {
        fun mapToMachineDtoList(machines: List<MachineDto>): List<Machine>{
            return machines.map { mapToMachine(it) }

        }

        fun mapToMachine(machine: MachineDto): Machine {
            return Machine(
                    machine.machineId,
                    machine.name,
                    machine.code,
                    machine.description,
                    machine.image,
                    machine.service_instruction
            )
        }

    }
}
