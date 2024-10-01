﻿// <auto-generated />
using DemoMvc.Data;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace WebMVC.Migrations
{
    [DbContext(typeof(ApplicationDbContext))]
    [Migration("20241001041534_Create_table_Employee")]
    partial class Create_table_Employee
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder.HasAnnotation("ProductVersion", "8.0.8");

            modelBuilder.Entity("WebMVC.Models.Person", b =>
                {
                    b.Property<string>("CCCD")
                        .HasColumnType("TEXT");

                    b.Property<string>("Discriminator")
                        .IsRequired()
                        .HasMaxLength(8)
                        .HasColumnType("TEXT");

                    b.Property<string>("HoTen")
                        .IsRequired()
                        .HasColumnType("TEXT");

                    b.Property<string>("QueQuan")
                        .IsRequired()
                        .HasColumnType("TEXT");

                    b.HasKey("CCCD");

                    b.ToTable("Person");

                    b.HasDiscriminator().HasValue("Person");

                    b.UseTphMappingStrategy();
                });

            modelBuilder.Entity("WebMVC.Models.Employee", b =>
                {
                    b.HasBaseType("WebMVC.Models.Person");

                    b.Property<string>("GioiTinh")
                        .IsRequired()
                        .HasColumnType("TEXT");

                    b.Property<int>("Tuoi")
                        .HasColumnType("INTEGER");

                    b.HasDiscriminator().HasValue("Employee");
                });
#pragma warning restore 612, 618
        }
    }
}
