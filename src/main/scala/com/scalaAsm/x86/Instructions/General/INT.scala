package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Call to Interrupt Procedure
// Category: general/breakstack

trait INT extends InstructionDefinition {
  val mnemonic = "INT"
}

object INT extends OneOperand[INT] with INTImpl

trait INTImpl extends INT {
  implicit object INT_0 extends _1[imm8] {
    val opcode: OneOpcode = 0xCD
    val explicitFormat = new ImmFormat{}
    override def hasImplicitOperand = true
  }
}
